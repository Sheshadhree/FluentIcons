package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Broom28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Broom28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.78f, 3.28f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.768f, -0.293f, -1.06f, 0f)
            lineToRelative(-8.257f, 8.256f)
            curveToRelative(-2.65f, -2.122f, -6.527f, -1.956f, -8.984f, 0.498f)
            lineToRelative(-0.693f, 0.68f)
            lineToRelative(-4.427f, 2.706f)
            curveToRelative(-0.196f, 0.12f, -0.327f, 0.323f, -0.354f, 0.551f)
            curveToRelative(-0.027f, 0.229f, 0.052f, 0.457f, 0.215f, 0.62f)
            lineToRelative(10.25f, 10.25f)
            curveToRelative(0.162f, 0.162f, 0.39f, 0.24f, 0.619f, 0.214f)
            curveToRelative(0.228f, -0.027f, 0.431f, -0.158f, 0.551f, -0.354f)
            lineToRelative(2.706f, -4.427f)
            lineToRelative(0.68f, -0.694f)
            curveToRelative(2.454f, -2.457f, 2.62f, -6.334f, 0.498f, -8.983f)
            lineTo(25.78f, 3.28f)
            close()
            moveTo(3.954f, 15.143f)
            lineToRelative(3.183f, -1.945f)
            lineToRelative(7.665f, 7.665f)
            lineToRelative(-1.945f, 3.183f)
            lineToRelative(-8.903f, -8.903f)
            close()
            moveToRelative(12.008f, 4.32f)
            lineToRelative(-0.217f, 0.221f)
            lineToRelative(-7.43f, -7.429f)
            lineToRelative(0.217f, -0.212f)
            lineToRelative(0.005f, -0.005f)
            curveToRelative(2.05f, -2.05f, 5.375f, -2.05f, 7.425f, 0f)
            reflectiveCurveToRelative(2.05f, 5.374f, 0f, 7.424f)
            close()
        }
    }.build()
}
