package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Temperature48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Temperature48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 8.5f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            verticalLineToRelative(15.787f)
            lineToRelative(-0.458f, 0.376f)
            curveTo(18.641f, 29.31f, 17.75f, 31.05f, 17.75f, 33f)
            curveToRelative(0f, 3.452f, 2.798f, 6.25f, 6.25f, 6.25f)
            reflectiveCurveToRelative(6.25f, -2.798f, 6.25f, -6.25f)
            curveToRelative(0f, -1.95f, -0.89f, -3.69f, -2.292f, -4.837f)
            lineTo(27.5f, 27.787f)
            verticalLineTo(12f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(18f, 12f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            verticalLineToRelative(14.631f)
            curveToRelative(1.692f, 1.594f, 2.75f, 3.858f, 2.75f, 6.369f)
            curveToRelative(0f, 4.833f, -3.918f, 8.75f, -8.75f, 8.75f)
            reflectiveCurveToRelative(-8.75f, -3.917f, -8.75f, -8.75f)
            curveToRelative(0f, -2.51f, 1.059f, -4.775f, 2.75f, -6.369f)
            verticalLineTo(12f)
            close()
            moveToRelative(10f, 21f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            curveToRelative(0f, -1.773f, 1.153f, -3.276f, 2.75f, -3.8f)
            verticalLineTo(18.25f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineTo(29.2f)
            curveTo(26.847f, 29.723f, 28f, 31.226f, 28f, 33f)
            close()
        }
    }.build()
}
