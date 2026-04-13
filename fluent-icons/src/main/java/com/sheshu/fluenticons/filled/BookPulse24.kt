package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookPulse24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookPulse24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.5f)
            curveTo(4f, 3.12f, 5.12f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(14.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(5.5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(13.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 22f, 4f, 20.88f, 4f, 19.5f)
            verticalLineToRelative(-15f)
            close()
            moveToRelative(7.69f, 2.958f)
            curveTo(11.578f, 7.188f, 11.317f, 7.01f, 11.025f, 7f)
            curveToRelative(-0.293f, -0.009f, -0.564f, 0.153f, -0.695f, 0.415f)
            lineTo(8.786f, 10.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 10.5f, 7f, 10.836f, 7f, 11.25f)
            reflectiveCurveTo(7.336f, 12f, 7.75f, 12f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.284f, 0f, 0.544f, -0.16f, 0.67f, -0.415f)
            lineToRelative(1.023f, -2.044f)
            lineToRelative(2.116f, 5.001f)
            curveToRelative(0.11f, 0.262f, 0.36f, 0.438f, 0.643f, 0.457f)
            curveToRelative(0.284f, 0.018f, 0.553f, -0.126f, 0.696f, -0.371f)
            lineTo(15.93f, 12f)
            horizontalLineToRelative(0.819f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(15.5f)
            curveToRelative(-0.267f, 0f, -0.513f, 0.142f, -0.648f, 0.372f)
            lineToRelative(-0.995f, 1.706f)
            lineToRelative(-2.166f, -5.12f)
            close()
        }
    }.build()
}
