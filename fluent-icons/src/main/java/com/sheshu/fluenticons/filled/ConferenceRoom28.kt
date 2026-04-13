package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ConferenceRoom28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ConferenceRoom28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.894f, 2.014f)
            lineToRelative(11.5f, 2.25f)
            curveTo(23.746f, 4.334f, 24f, 4.642f, 24f, 5f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 0.359f, -0.254f, 0.667f, -0.606f, 0.736f)
            lineToRelative(-11.5f, 2.25f)
            curveTo(11.431f, 26.076f, 11f, 25.722f, 11f, 25.25f)
            verticalLineTo(2.75f)
            curveToRelative(0f, -0.472f, 0.43f, -0.826f, 0.894f, -0.736f)
            close()
            moveTo(15f, 13f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            curveToRelative(0f, 0.553f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.447f, 1f, -1f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(-5f, -8.5f)
            verticalLineToRelative(19f)
            horizontalLineTo(4.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(4f, 22.75f)
            verticalLineTo(5.25f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(4.75f, 4.5f)
            horizontalLineTo(10f)
            close()
        }
    }.build()
}
