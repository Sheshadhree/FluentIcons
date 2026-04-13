package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Eye32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Eye32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.998f, 24f)
            curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
            close()
            moveToRelative(0f, -11f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
            reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
            close()
            moveToRelative(13.5f, 5f)
            curveToRelative(-0.23f, 0f, -0.43f, -0.16f, -0.49f, -0.39f)
            curveTo(28.908f, 17.18f, 26.458f, 7f, 15.998f, 7f)
            reflectiveCurveTo(3.088f, 17.18f, 2.988f, 17.61f)
            curveToRelative(-0.06f, 0.27f, -0.33f, 0.44f, -0.6f, 0.38f)
            curveToRelative(-0.27f, -0.06f, -0.44f, -0.33f, -0.38f, -0.6f)
            curveTo(2.038f, 17.28f, 4.728f, 6f, 15.998f, 6f)
            reflectiveCurveToRelative(13.96f, 11.27f, 13.99f, 11.39f)
            curveToRelative(0.06f, 0.27f, -0.11f, 0.54f, -0.38f, 0.6f)
            curveToRelative(-0.04f, 0f, -0.08f, 0.01f, -0.11f, 0.01f)
            close()
        }
    }.build()
}
