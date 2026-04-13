package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Power20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Power20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.75f, 2.5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(9.25f, 2.086f, 9.25f, 2.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-6f)
            close()
            moveTo(13.743f, 4f)
            curveToRelative(-0.359f, -0.206f, -0.817f, -0.082f, -1.024f, 0.277f)
            curveToRelative(-0.207f, 0.358f, -0.083f, 0.817f, 0.276f, 1.024f)
            curveToRelative(1.144f, 0.66f, 2.04f, 1.678f, 2.546f, 2.898f)
            curveToRelative(0.507f, 1.22f, 0.597f, 2.573f, 0.256f, 3.85f)
            curveToRelative(-0.341f, 1.276f, -1.094f, 2.404f, -2.141f, 3.209f)
            curveToRelative(-1.048f, 0.805f, -2.332f, 1.241f, -3.653f, 1.242f)
            curveToRelative(-1.32f, 0f, -2.605f, -0.435f, -3.654f, -1.238f)
            curveToRelative(-1.048f, -0.804f, -1.802f, -1.932f, -2.144f, -3.207f)
            curveToRelative(-0.342f, -1.277f, -0.254f, -2.63f, 0.251f, -3.85f)
            curveToRelative(0.506f, -1.22f, 1.4f, -2.24f, 2.544f, -2.901f)
            curveToRelative(0.359f, -0.207f, 0.482f, -0.666f, 0.274f, -1.025f)
            curveTo(7.067f, 3.921f, 6.61f, 3.798f, 6.25f, 4.005f)
            curveTo(4.82f, 4.83f, 3.702f, 6.105f, 3.07f, 7.63f)
            curveToRelative(-0.631f, 1.525f, -0.742f, 3.217f, -0.314f, 4.812f)
            curveToRelative(0.428f, 1.595f, 1.37f, 3.004f, 2.68f, 4.009f)
            curveToRelative(1.311f, 1.005f, 2.917f, 1.549f, 4.568f, 1.548f)
            curveToRelative(1.651f, 0f, 3.256f, -0.547f, 4.566f, -1.553f)
            curveToRelative(1.309f, -1.006f, 2.25f, -2.416f, 2.676f, -4.011f)
            curveToRelative(0.426f, -1.596f, 0.314f, -3.287f, -0.32f, -4.813f)
            curveTo(16.293f, 6.097f, 15.174f, 4.824f, 13.743f, 4f)
            close()
        }
    }.build()
}
