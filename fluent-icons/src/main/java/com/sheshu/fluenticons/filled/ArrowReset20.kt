package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowReset20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowReset20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.03f, 2.47f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(4.81f, 4.75f)
            horizontalLineTo(11f)
            curveToRelative(3.452f, 0f, 6.25f, 2.798f, 6.25f, 6.25f)
            reflectiveCurveToRelative(-2.798f, 6.25f, -6.25f, 6.25f)
            reflectiveCurveTo(4.75f, 14.452f, 4.75f, 11f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(6.25f, 10.586f, 6.25f, 11f)
            curveToRelative(0f, 2.623f, 2.127f, 4.75f, 4.75f, 4.75f)
            reflectiveCurveToRelative(4.75f, -2.127f, 4.75f, -4.75f)
            reflectiveCurveTo(13.623f, 6.25f, 11f, 6.25f)
            horizontalLineTo(4.81f)
            lineToRelative(1.22f, 1.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
        }
    }.build()
}
