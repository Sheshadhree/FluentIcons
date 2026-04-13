package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookDefault20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookDefault20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(15.776f, 18f, 15.5f, 18f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            close()
            moveToRelative(2.75f, 0f)
            curveTo(6.336f, 4f, 6f, 4.336f, 6f, 4.75f)
            verticalLineToRelative(0.5f)
            curveTo(6f, 5.664f, 6.336f, 6f, 6.75f, 6f)
            horizontalLineToRelative(6.5f)
            curveTo(13.664f, 6f, 14f, 5.664f, 14f, 5.25f)
            verticalLineToRelative(-0.5f)
            curveTo(14f, 4.336f, 13.664f, 4f, 13.25f, 4f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
