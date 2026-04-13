package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataTrending20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataTrending20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 2f)
            curveTo(3.164f, 2f, 3.5f, 2.336f, 3.5f, 2.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(17.664f, 18f, 17.25f, 18f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 18f, 2f, 16.769f, 2f, 15.25f)
            verticalLineTo(2.75f)
            curveTo(2f, 2.336f, 2.336f, 2f, 2.75f, 2f)
            close()
            moveTo(12f, 5.75f)
            curveTo(12f, 5.336f, 12.336f, 5f, 12.75f, 5f)
            horizontalLineToRelative(3.5f)
            curveTo(16.664f, 5f, 17f, 5.336f, 17f, 5.75f)
            verticalLineToRelative(3.5f)
            curveTo(17f, 9.664f, 16.664f, 10f, 16.25f, 10f)
            reflectiveCurveTo(15.5f, 9.664f, 15.5f, 9.25f)
            verticalLineTo(7.56f)
            lineToRelative(-3.97f, 3.97f)
            curveToRelative(-0.14f, 0.141f, -0.331f, 0.22f, -0.53f, 0.22f)
            reflectiveCurveToRelative(-0.39f, -0.079f, -0.53f, -0.22f)
            lineTo(9f, 10.06f)
            lineToRelative(-2.22f, 2.22f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(2.75f, -2.75f)
            curveTo(8.61f, 8.329f, 8.8f, 8.25f, 9f, 8.25f)
            reflectiveCurveToRelative(0.39f, 0.079f, 0.53f, 0.22f)
            lineTo(11f, 9.94f)
            lineToRelative(3.44f, -3.44f)
            horizontalLineToRelative(-1.69f)
            curveTo(12.336f, 6.5f, 12f, 6.164f, 12f, 5.75f)
            close()
        }
    }.build()
}
