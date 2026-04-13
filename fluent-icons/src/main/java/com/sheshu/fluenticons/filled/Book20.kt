package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Book20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Book20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 17f, 15.5f, 17f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
            moveToRelative(0.75f, 2.5f)
            horizontalLineToRelative(6.5f)
            curveTo(13.664f, 4.5f, 14f, 4.836f, 14f, 5.25f)
            reflectiveCurveTo(13.664f, 6f, 13.25f, 6f)
            horizontalLineToRelative(-6.5f)
            curveTo(6.336f, 6f, 6f, 5.664f, 6f, 5.25f)
            reflectiveCurveTo(6.336f, 4.5f, 6.75f, 4.5f)
            close()
        }
    }.build()
}
