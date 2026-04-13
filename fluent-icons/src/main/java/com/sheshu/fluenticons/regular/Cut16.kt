package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cut16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cut16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.78f, 1.08f)
            curveToRelative(0.23f, 0.16f, 0.29f, 0.47f, 0.14f, 0.7f)
            lineTo(9.21f, 5.85f)
            lineTo(8.6f, 4.94f)
            lineToRelative(2.48f, -3.72f)
            curveToRelative(0.16f, -0.23f, 0.47f, -0.29f, 0.7f, -0.14f)
            close()
            moveToRelative(-0.951f, 9.012f)
            curveTo(11.043f, 10.033f, 11.268f, 10f, 11.5f, 10f)
            verticalLineToRelative(0.001f)
            curveToRelative(1.379f, 0f, 2.5f, 1.122f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
            curveToRelative(0f, -0.786f, 0.365f, -1.488f, 0.934f, -1.947f)
            lineToRelative(-1.933f, -2.9f)
            lineToRelative(-1.932f, 2.902f)
            curveTo(6.636f, 11.014f, 7f, 11.715f, 7f, 12.5f)
            curveTo(7f, 13.878f, 5.879f, 15f, 4.5f, 15f)
            reflectiveCurveTo(2f, 13.878f, 2f, 12.5f)
            reflectiveCurveTo(3.121f, 10f, 4.5f, 10f)
            curveToRelative(0.231f, 0f, 0.454f, 0.032f, 0.666f, 0.091f)
            lineToRelative(2.229f, -3.348f)
            lineToRelative(-3.311f, -4.966f)
            curveToRelative(-0.153f, -0.23f, -0.09f, -0.54f, 0.139f, -0.693f)
            curveToRelative(0.227f, -0.153f, 0.539f, -0.092f, 0.693f, 0.139f)
            lineToRelative(5.913f, 8.869f)
            close()
            moveTo(3f, 12.5f)
            curveTo(3f, 13.327f, 3.673f, 14f, 4.5f, 14f)
            reflectiveCurveTo(6f, 13.327f, 6f, 12.5f)
            reflectiveCurveTo(5.327f, 11f, 4.5f, 11f)
            reflectiveCurveTo(3f, 11.673f, 3f, 12.5f)
            close()
            moveToRelative(7f, 0f)
            curveToRelative(0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
            close()
        }
    }.build()
}
