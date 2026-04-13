package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataHistogram16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataHistogram16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveTo(6f, 2.895f, 6f, 4f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(4f)
            verticalLineTo(4f)
            close()
            moveTo(5f, 7f)
            horizontalLineTo(4f)
            curveTo(2.895f, 7f, 2f, 7.895f, 2f, 9f)
            verticalLineToRelative(4.5f)
            curveTo(2f, 13.776f, 2.224f, 14f, 2.5f, 14f)
            horizontalLineTo(5f)
            verticalLineTo(7f)
            close()
            moveToRelative(6f, 7f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(9f)
            close()
        }
    }.build()
}
