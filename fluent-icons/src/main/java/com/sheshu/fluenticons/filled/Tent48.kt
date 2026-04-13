package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tent48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tent48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.002f, 6.02f)
            curveToRelative(-0.238f, -0.285f, -0.59f, -0.45f, -0.96f, -0.45f)
            curveToRelative(-0.372f, 0f, -0.723f, 0.165f, -0.96f, 0.45f)
            curveToRelative(-2.992f, 3.59f, -8.895f, 7.85f, -12.29f, 9.746f)
            curveToRelative(-0.342f, 0.191f, -0.575f, 0.532f, -0.628f, 0.92f)
            lineTo(7.434f, 36.5f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 36.5f, 4f, 37.06f, 4f, 37.75f)
            reflectiveCurveTo(4.56f, 39f, 5.25f, 39f)
            horizontalLineToRelative(37.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-2.1f)
            lineToRelative(-2.73f, -19.813f)
            curveToRelative(-0.054f, -0.389f, -0.287f, -0.73f, -0.63f, -0.92f)
            curveToRelative(-3.394f, -1.897f, -9.297f, -6.157f, -12.288f, -9.747f)
            close()
            moveTo(17.787f, 36.5f)
            curveToRelative(2.097f, -3.048f, 4.261f, -6.965f, 6.213f, -13.152f)
            curveToRelative(1.764f, 5.581f, 3.732f, 9.44f, 6.213f, 13.152f)
            horizontalLineTo(17.786f)
            close()
        }
    }.build()
}
