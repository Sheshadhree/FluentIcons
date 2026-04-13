package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tag28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tag28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.987f, 3.952f)
            curveTo(13.597f, 3.342f, 14.423f, 3f, 15.285f, 3f)
            horizontalLineToRelative(6.965f)
            curveTo(23.768f, 3f, 25f, 4.231f, 25f, 5.75f)
            verticalLineToRelative(6.964f)
            curveToRelative(0f, 0.862f, -0.343f, 1.69f, -0.952f, 2.299f)
            lineToRelative(-9.25f, 9.25f)
            curveToRelative(-1.27f, 1.269f, -3.327f, 1.269f, -4.597f, 0f)
            lineToRelative(-6.464f, -6.465f)
            curveToRelative(-1.27f, -1.27f, -1.27f, -3.327f, 0f, -4.596f)
            lineToRelative(9.25f, -9.25f)
            close()
            moveTo(19.5f, 10f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(20.328f, 7f, 19.5f, 7f)
            reflectiveCurveTo(18f, 7.672f, 18f, 8.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
