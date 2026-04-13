package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PictureInPictureEnter20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PictureInPictureEnter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.75f)
            curveTo(2f, 4.231f, 3.231f, 3f, 4.75f, 3f)
            horizontalLineToRelative(10.5f)
            curveTo(16.769f, 3f, 18f, 4.231f, 18f, 5.75f)
            verticalLineTo(10f)
            horizontalLineToRelative(-1f)
            verticalLineTo(5.75f)
            curveTo(17f, 4.784f, 16.216f, 4f, 15.25f, 4f)
            horizontalLineTo(4.75f)
            curveTo(3.784f, 4f, 3f, 4.784f, 3f, 5.75f)
            verticalLineToRelative(6.5f)
            curveTo(3f, 13.216f, 3.784f, 14f, 4.75f, 14f)
            horizontalLineTo(9f)
            verticalLineToRelative(1f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 15f, 2f, 13.769f, 2f, 12.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveTo(11.5f, 11f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(4.646f, 5.646f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(8f, 8.293f)
            verticalLineTo(6.5f)
            curveTo(8f, 6.224f, 8.224f, 6f, 8.5f, 6f)
            reflectiveCurveTo(9f, 6.224f, 9f, 6.5f)
            verticalLineToRelative(3f)
            curveTo(9f, 9.776f, 8.776f, 10f, 8.5f, 10f)
            horizontalLineToRelative(-3f)
            curveTo(5.224f, 10f, 5f, 9.776f, 5f, 9.5f)
            reflectiveCurveTo(5.224f, 9f, 5.5f, 9f)
            horizontalLineToRelative(1.793f)
            lineTo(4.646f, 6.354f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
