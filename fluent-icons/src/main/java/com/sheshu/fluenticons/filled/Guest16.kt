package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Guest16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Guest16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 2.5f)
            curveTo(13f, 1.672f, 12.328f, 1f, 11.5f, 1f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 1f, 3f, 1.672f, 3f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 14.328f, 3.672f, 15f, 4.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-11f)
            close()
            moveToRelative(-6.5f, 1f)
            curveTo(6.5f, 3.224f, 6.724f, 3f, 7f, 3f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.276f, 4f, 9f, 4f)
            horizontalLineTo(7f)
            curveTo(6.724f, 4f, 6.5f, 3.776f, 6.5f, 3.5f)
            close()
            moveTo(6f, 7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            curveToRelative(1.104f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveTo(9.104f, 9f, 8f, 9f)
            curveTo(6.895f, 9f, 6f, 8.105f, 6f, 7f)
            close()
            moveToRelative(-0.305f, 3f)
            horizontalLineToRelative(4.61f)
            curveToRelative(0.331f, 0f, 0.69f, 0.238f, 0.72f, 0.657f)
            curveToRelative(0.023f, 0.315f, -0.005f, 0.922f, -0.46f, 1.453f)
            curveTo(10.105f, 12.65f, 9.297f, 13f, 8f, 13f)
            reflectiveCurveToRelative(-2.104f, -0.35f, -2.566f, -0.89f)
            curveToRelative(-0.455f, -0.531f, -0.482f, -1.138f, -0.46f, -1.453f)
            curveTo(5.004f, 10.237f, 5.364f, 10f, 5.695f, 10f)
            close()
        }
    }.build()
}
