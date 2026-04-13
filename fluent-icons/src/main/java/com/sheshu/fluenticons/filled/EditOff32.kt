package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EditOff32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EditOff32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.75f, 20.164f)
            lineToRelative(9.543f, 9.543f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-26f, -26f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(9.542f, 9.543f)
            lineToRelative(-7.478f, 7.479f)
            curveToRelative(-0.505f, 0.504f, -0.852f, 1.143f, -1.002f, 1.84f)
            lineTo(2.022f, 28.79f)
            curveToRelative(-0.07f, 0.332f, 0.031f, 0.677f, 0.27f, 0.917f)
            curveToRelative(0.24f, 0.24f, 0.586f, 0.342f, 0.917f, 0.27f)
            lineToRelative(6.22f, -1.332f)
            curveToRelative(0.698f, -0.15f, 1.338f, -0.498f, 1.842f, -1.002f)
            lineToRelative(7.479f, -7.48f)
            close()
            moveToRelative(7.5f, -7.5f)
            lineToRelative(-5.024f, 5.024f)
            lineToRelative(-6.915f, -6.914f)
            lineToRelative(5.024f, -5.025f)
            lineToRelative(6.914f, 6.914f)
            close()
            moveToRelative(-4.6f, -9.23f)
            curveToRelative(1.91f, -1.91f, 5.005f, -1.91f, 6.915f, 0f)
            curveToRelative(1.909f, 1.91f, 1.909f, 5.005f, 0f, 6.914f)
            lineToRelative(-0.902f, 0.901f)
            lineToRelative(-6.914f, -6.914f)
            lineToRelative(0.901f, -0.901f)
            close()
        }
    }.build()
}
