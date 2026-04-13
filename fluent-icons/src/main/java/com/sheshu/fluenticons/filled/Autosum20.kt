package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Autosum20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Autosum20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.81f, 3.706f)
            curveTo(3.928f, 3.43f, 4.2f, 3.25f, 4.5f, 3.25f)
            horizontalLineToRelative(11f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(6.262f)
            lineToRelative(4.146f, 4.308f)
            curveToRelative(0.265f, 0.276f, 0.28f, 0.707f, 0.035f, 1.001f)
            lineTo(6.104f, 15.25f)
            horizontalLineTo(15.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-11f)
            curveToRelative(-0.291f, 0f, -0.556f, -0.169f, -0.68f, -0.432f)
            curveToRelative(-0.123f, -0.264f, -0.082f, -0.576f, 0.105f, -0.799f)
            lineTo(8.86f, 9.613f)
            lineTo(3.96f, 4.52f)
            curveTo(3.75f, 4.303f, 3.692f, 3.983f, 3.81f, 3.706f)
            close()
        }
    }.build()
}
