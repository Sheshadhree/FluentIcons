package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cube48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cube48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.679f, 5.332f)
            curveToRelative(1.49f, -0.596f, 3.152f, -0.596f, 4.642f, 0f)
            lineToRelative(15.007f, 6.003f)
            curveTo(42.942f, 11.98f, 44f, 13.543f, 44f, 15.281f)
            verticalLineToRelative(17.438f)
            curveToRelative(0f, 1.738f, -1.058f, 3.3f, -2.672f, 3.946f)
            lineToRelative(-15.007f, 6.003f)
            curveToRelative(-1.49f, 0.596f, -3.152f, 0.596f, -4.642f, 0f)
            lineTo(6.672f, 36.665f)
            curveTo(5.058f, 36.019f, 4f, 34.457f, 4f, 32.719f)
            verticalLineTo(15.28f)
            curveToRelative(0f, -1.738f, 1.058f, -3.3f, 2.671f, -3.946f)
            lineTo(21.68f, 5.332f)
            close()
            moveToRelative(-7.426f, 10.273f)
            curveToRelative(-0.633f, -0.277f, -1.37f, 0.01f, -1.648f, 0.642f)
            curveToRelative(-0.277f, 0.633f, 0.01f, 1.37f, 0.643f, 1.648f)
            lineToRelative(9.502f, 4.171f)
            verticalLineToRelative(9.184f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-9.184f)
            lineToRelative(9.502f, -4.171f)
            curveToRelative(0.633f, -0.278f, 0.92f, -1.015f, 0.643f, -1.648f)
            curveToRelative(-0.278f, -0.632f, -1.015f, -0.92f, -1.648f, -0.642f)
            lineTo(24f, 19.885f)
            lineToRelative(-9.748f, -4.28f)
            close()
        }
    }.build()
}
