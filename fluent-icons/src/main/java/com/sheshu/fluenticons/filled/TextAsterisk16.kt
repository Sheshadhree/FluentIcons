package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextAsterisk16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAsterisk16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 14.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(9.811f)
            lineTo(4.641f, 12.42f)
            curveToRelative(-0.143f, 0.142f, -0.331f, 0.219f, -0.531f, 0.219f)
            reflectiveCurveToRelative(-0.389f, -0.078f, -0.53f, -0.219f)
            curveToRelative(-0.292f, -0.293f, -0.292f, -0.769f, 0f, -1.061f)
            lineTo(6.189f, 8.75f)
            horizontalLineToRelative(-3.69f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3.689f)
            lineTo(3.579f, 4.641f)
            curveToRelative(-0.292f, -0.292f, -0.292f, -0.768f, 0f, -1.061f)
            curveToRelative(0.142f, -0.142f, 0.33f, -0.219f, 0.53f, -0.219f)
            reflectiveCurveToRelative(0.389f, 0.078f, 0.53f, 0.219f)
            lineToRelative(2.609f, 2.609f)
            verticalLineTo(2.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(3.689f)
            lineToRelative(2.609f, -2.609f)
            curveToRelative(0.142f, -0.142f, 0.33f, -0.219f, 0.53f, -0.219f)
            reflectiveCurveToRelative(0.388f, 0.078f, 0.53f, 0.219f)
            curveToRelative(0.292f, 0.293f, 0.292f, 0.769f, 0f, 1.061f)
            lineTo(9.808f, 7.25f)
            horizontalLineToRelative(3.689f)
            curveToRelative(0.415f, 0f, 0.752f, 0.336f, 0.752f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(9.81f)
            lineToRelative(2.609f, 2.609f)
            curveToRelative(0.292f, 0.292f, 0.292f, 0.768f, 0f, 1.061f)
            curveToRelative(-0.144f, 0.142f, -0.332f, 0.219f, -0.531f, 0.219f)
            curveToRelative(-0.201f, 0f, -0.39f, -0.078f, -0.531f, -0.219f)
            lineTo(8.748f, 9.811f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}
