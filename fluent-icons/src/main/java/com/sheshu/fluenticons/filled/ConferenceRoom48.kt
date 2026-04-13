package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ConferenceRoom48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ConferenceRoom48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.503f, 7.776f)
            lineToRelative(14.5f, 3f)
            curveTo(37.583f, 10.896f, 38f, 11.408f, 38f, 12f)
            verticalLineToRelative(24f)
            curveToRelative(0f, 0.593f, -0.416f, 1.104f, -0.997f, 1.224f)
            lineToRelative(-14.5f, 3f)
            curveTo(21.727f, 40.386f, 21f, 39.794f, 21f, 39.002f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.793f, 0.727f, -1.385f, 1.503f, -1.225f)
            close()
            moveTo(18f, 10f)
            lineToRelative(0.128f, 27.994f)
            lineTo(18f, 38.001f)
            horizontalLineToRelative(-6.75f)
            curveToRelative(-0.647f, 0f, -1.18f, -0.492f, -1.243f, -1.123f)
            lineTo(10f, 36.751f)
            verticalLineToRelative(-25.5f)
            curveToRelative(0f, -0.648f, 0.492f, -1.18f, 1.122f, -1.244f)
            lineTo(11.25f, 10f)
            horizontalLineTo(18f)
            close()
            moveToRelative(8.5f, 12.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            curveToRelative(0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveTo(28f, 24.83f, 28f, 24f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.build()
}
