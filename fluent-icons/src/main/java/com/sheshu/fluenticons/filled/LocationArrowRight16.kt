package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationArrowRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrowRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 7f)
            curveToRelative(0f, 2.876f, -3.1f, 6.01f, -4.844f, 7.544f)
            curveToRelative(-0.668f, 0.588f, -1.645f, 0.588f, -2.312f, 0f)
            curveTo(5.101f, 13.01f, 2f, 9.876f, 2f, 7f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
            moveTo(8.146f, 4.854f)
            lineTo(9.293f, 6f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 6f, 5f, 6.224f, 5f, 6.5f)
            reflectiveCurveTo(5.224f, 7f, 5.5f, 7f)
            horizontalLineToRelative(3.793f)
            lineTo(8.147f, 8.146f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.707f)
            curveToRelative(0.195f, 0.196f, 0.511f, 0.196f, 0.707f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            close()
        }
    }.build()
}
