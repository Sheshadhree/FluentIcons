package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Guest24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Guest24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.995f, 4.096f)
            curveTo(19.915f, 2.926f, 18.94f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            lineTo(6.096f, 2.005f)
            curveTo(4.926f, 2.085f, 4f, 3.06f, 4f, 4.25f)
            verticalLineToRelative(15.505f)
            lineToRelative(0.005f, 0.154f)
            curveToRelative(0.08f, 1.17f, 1.054f, 2.096f, 2.245f, 2.096f)
            horizontalLineToRelative(11.5f)
            lineToRelative(0.154f, -0.006f)
            curveTo(19.074f, 21.92f, 20f, 20.946f, 20f, 19.755f)
            verticalLineTo(4.25f)
            lineToRelative(-0.005f, -0.154f)
            close()
            moveTo(10f, 5.75f)
            curveTo(10f, 5.336f, 10.336f, 5f, 10.75f, 5f)
            horizontalLineToRelative(2.5f)
            curveTo(13.664f, 5f, 14f, 5.336f, 14f, 5.75f)
            reflectiveCurveTo(13.664f, 6.5f, 13.25f, 6.5f)
            horizontalLineToRelative(-2.5f)
            curveTo(10.336f, 6.5f, 10f, 6.164f, 10f, 5.75f)
            close()
            moveToRelative(4.75f, 9.246f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(0.499f)
            curveToRelative(0f, 1.846f, -1.472f, 2.754f, -4f, 2.754f)
            reflectiveCurveToRelative(-4f, -0.909f, -4f, -2.756f)
            verticalLineToRelative(-0.497f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(5.5f)
            close()
            moveToRelative(-2.75f, -6f)
            curveToRelative(1.38f, 0f, 2.5f, 1.119f, 2.5f, 2.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            curveToRelative(0f, -1.381f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
        }
    }.build()
}
