package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Emoji24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Emoji24",
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
            moveTo(8.462f, 14.783f)
            curveToRelative(-0.257f, -0.325f, -0.728f, -0.381f, -1.054f, -0.125f)
            curveToRelative(-0.325f, 0.256f, -0.38f, 0.728f, -0.125f, 1.053f)
            curveToRelative(1.131f, 1.435f, 2.854f, 2.29f, 4.717f, 2.29f)
            curveToRelative(1.86f, 0f, 3.581f, -0.853f, 4.712f, -2.284f)
            curveToRelative(0.257f, -0.325f, 0.201f, -0.797f, -0.124f, -1.054f)
            curveToRelative(-0.325f, -0.256f, -0.796f, -0.201f, -1.053f, 0.124f)
            curveToRelative(-0.85f, 1.075f, -2.139f, 1.714f, -3.535f, 1.714f)
            curveToRelative(-1.398f, 0f, -2.69f, -0.64f, -3.538f, -1.718f)
            close()
            moveTo(9f, 8.75f)
            curveToRelative(-0.69f, 0f, -1.249f, 0.56f, -1.249f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.249f, 1.25f, 1.249f)
            reflectiveCurveToRelative(1.249f, -0.56f, 1.249f, -1.25f)
            reflectiveCurveTo(9.69f, 8.75f, 9f, 8.75f)
            close()
            moveToRelative(6f, 0f)
            curveToRelative(-0.69f, 0f, -1.249f, 0.56f, -1.249f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.249f, 1.25f, 1.249f)
            reflectiveCurveToRelative(1.249f, -0.56f, 1.249f, -1.25f)
            reflectiveCurveTo(15.69f, 8.75f, 15f, 8.75f)
            close()
        }
    }.build()
}
