package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CompassNorthwest24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CompassNorthwest24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
            moveTo(8.562f, 7.435f)
            curveToRelative(-0.706f, -0.268f, -1.397f, 0.423f, -1.13f, 1.128f)
            lineToRelative(1.508f, 3.964f)
            curveToRelative(0.444f, 1.169f, 1.366f, 2.092f, 2.535f, 2.537f)
            lineToRelative(3.963f, 1.505f)
            curveToRelative(0.705f, 0.268f, 1.396f, -0.423f, 1.128f, -1.129f)
            lineToRelative(-1.505f, -3.963f)
            curveToRelative(-0.444f, -1.169f, -1.367f, -2.091f, -2.536f, -2.536f)
            lineTo(8.562f, 7.435f)
            close()
        }
    }.build()
}
