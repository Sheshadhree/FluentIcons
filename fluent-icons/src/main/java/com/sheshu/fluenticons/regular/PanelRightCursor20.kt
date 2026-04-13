package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PanelRightCursor20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelRightCursor20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            curveTo(3.343f, 3f, 2f, 4.343f, 2f, 6f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(5.001f)
            verticalLineToRelative(-1f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(5f)
            curveToRelative(0.363f, 0f, 0.72f, 0.13f, 1f, 0.379f)
            verticalLineTo(4f)
            horizontalLineTo(15f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.249f, -0.046f, 0.487f, -0.129f, 0.707f)
            lineToRelative(0.754f, 0.747f)
            curveTo(17.864f, 14.024f, 18f, 13.527f, 18f, 13f)
            verticalLineTo(6f)
            close()
            moveToRelative(-6.144f, 4.146f)
            curveToRelative(-0.143f, -0.142f, -0.358f, -0.184f, -0.544f, -0.107f)
            curveToRelative(-0.186f, 0.078f, -0.307f, 0.26f, -0.308f, 0.462f)
            lineTo(11f, 18.498f)
            curveToRelative(0f, 0.215f, 0.137f, 0.406f, 0.341f, 0.474f)
            curveToRelative(0.204f, 0.069f, 0.429f, -0.001f, 0.558f, -0.173f)
            lineToRelative(1.995f, -2.647f)
            lineToRelative(3.497f, 0.776f)
            curveToRelative(0.217f, 0.049f, 0.44f, -0.053f, 0.547f, -0.248f)
            curveToRelative(0.107f, -0.196f, 0.071f, -0.438f, -0.087f, -0.595f)
            lineToRelative(-5.995f, -5.94f)
            close()
        }
    }.build()
}
