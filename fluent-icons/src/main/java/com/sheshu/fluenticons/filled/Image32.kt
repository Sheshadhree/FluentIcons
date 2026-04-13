package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Image32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Image32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 3f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 0.849f, 0.235f, 1.643f, 0.644f, 2.32f)
            lineToRelative(10.588f, -10.588f)
            curveToRelative(0.977f, -0.976f, 2.56f, -0.976f, 3.536f, 0f)
            lineToRelative(10.588f, 10.589f)
            curveTo(28.765f, 26.143f, 29f, 25.349f, 29f, 24.5f)
            verticalLineToRelative(-17f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineToRelative(-17f)
            close()
            moveToRelative(17f, 8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveToRelative(2.47f, 17.262f)
            lineTo(16.354f, 17.646f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(5.03f, 28.262f)
            curveTo(5.74f, 28.73f, 6.588f, 29f, 7.5f, 29f)
            horizontalLineToRelative(17f)
            curveToRelative(0.912f, 0f, 1.76f, -0.271f, 2.47f, -0.738f)
            close()
        }
    }.build()
}
