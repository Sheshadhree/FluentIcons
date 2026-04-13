package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CircleLine24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleLine24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.533f, 11.25f)
            horizontalLineToRelative(16.934f)
            curveTo(20.087f, 6.907f, 16.442f, 3.5f, 12f, 3.5f)
            reflectiveCurveToRelative(-8.088f, 3.407f, -8.467f, 7.75f)
            close()
            moveToRelative(16.934f, 1.5f)
            horizontalLineTo(3.533f)
            curveTo(3.913f, 17.093f, 7.558f, 20.5f, 12f, 20.5f)
            reflectiveCurveToRelative(8.088f, -3.407f, 8.467f, -7.75f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            close()
        }
    }.build()
}
