package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Attach32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Attach32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.028f, 4.397f)
            curveToRelative(3.197f, -3.196f, 8.379f, -3.196f, 11.575f, 0f)
            curveToRelative(3.197f, 3.197f, 3.197f, 8.38f, 0f, 11.576f)
            lineTo(15.06f, 28.515f)
            curveToRelative(-1.977f, 1.978f, -5.184f, 1.978f, -7.161f, 0f)
            curveToRelative(-1.978f, -1.977f, -1.978f, -5.184f, 0f, -7.162f)
            lineToRelative(11.14f, -11.14f)
            curveToRelative(0.489f, -0.489f, 1.28f, -0.489f, 1.769f, 0f)
            curveToRelative(0.488f, 0.487f, 0.488f, 1.279f, 0f, 1.767f)
            lineTo(9.665f, 23.12f)
            curveToRelative(-1.001f, 1.002f, -1.001f, 2.625f, 0f, 3.627f)
            curveToRelative(1.002f, 1.001f, 2.625f, 1.001f, 3.627f, 0f)
            lineToRelative(12.543f, -12.543f)
            curveToRelative(2.22f, -2.22f, 2.22f, -5.82f, 0f, -8.04f)
            curveToRelative(-2.22f, -2.22f, -5.82f, -2.22f, -8.04f, 0f)
            lineTo(4.135f, 19.827f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, -1.28f, 0f, -1.768f)
            lineTo(16.028f, 4.397f)
            close()
        }
    }.build()
}
