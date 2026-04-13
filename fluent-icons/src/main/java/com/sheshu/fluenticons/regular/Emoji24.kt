package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Emoji24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Emoji24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 1.998f)
            curveToRelative(5.524f, 0f, 10.002f, 4.478f, 10.002f, 10.002f)
            curveToRelative(0f, 5.523f, -4.479f, 10f, -10.002f, 10f)
            curveToRelative(-5.524f, 0.001f, -10.002f, -4.477f, -10.002f, -10f)
            curveTo(1.998f, 6.476f, 6.476f, 1.998f, 12f, 1.998f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-4.695f, 0f, -8.502f, 3.806f, -8.502f, 8.502f)
            curveToRelative(0f, 4.695f, 3.807f, 8.501f, 8.502f, 8.501f)
            reflectiveCurveToRelative(8.502f, -3.806f, 8.502f, -8.501f)
            curveToRelative(0f, -4.696f, -3.807f, -8.502f, -8.502f, -8.502f)
            close()
            moveTo(8.462f, 14.783f)
            curveTo(9.31f, 15.86f, 10.602f, 16.5f, 12f, 16.5f)
            curveToRelative(1.396f, 0f, 2.686f, -0.639f, 3.535f, -1.714f)
            curveToRelative(0.257f, -0.325f, 0.728f, -0.38f, 1.053f, -0.124f)
            curveToRelative(0.325f, 0.257f, 0.38f, 0.729f, 0.124f, 1.054f)
            curveTo(15.582f, 17.148f, 13.86f, 18f, 12f, 18f)
            curveToRelative(-1.863f, 0f, -3.586f, -0.855f, -4.716f, -2.29f)
            curveToRelative(-0.257f, -0.325f, -0.2f, -0.797f, 0.124f, -1.053f)
            curveToRelative(0.326f, -0.256f, 0.797f, -0.2f, 1.054f, 0.125f)
            close()
            moveTo(9f, 8.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(9.69f, 11.248f, 9f, 11.248f)
            reflectiveCurveToRelative(-1.249f, -0.56f, -1.249f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.249f, 1.25f, -1.249f)
            close()
            moveToRelative(6f, 0f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.249f, -1.25f, 1.249f)
            reflectiveCurveToRelative(-1.249f, -0.56f, -1.249f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.249f, 1.25f, -1.249f)
            close()
        }
    }.build()
}
