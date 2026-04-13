package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailUnread24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailUnread24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            curveToRelative(-1.32f, 0f, -2.441f, 0.853f, -2.842f, 2.038f)
            curveTo(18.055f, 4.34f, 18f, 4.663f, 18f, 5f)
            curveToRelative(0f, 1.364f, 0.91f, 2.516f, 2.158f, 2.88f)
            curveTo(20.425f, 7.958f, 20.708f, 8f, 21f, 8f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineToRelative(11.361f)
            curveTo(16.538f, 4.322f, 16.5f, 4.656f, 16.5f, 5f)
            curveToRelative(0f, 1.563f, 0.796f, 2.939f, 2.005f, 3.746f)
            lineTo(12f, 12.153f)
            lineToRelative(-9.984f, -5.23f)
            curveToRelative(0.158f, -1.58f, 1.448f, -2.828f, 3.048f, -2.918f)
            lineTo(5.25f, 4f)
            close()
            moveToRelative(7.098f, 9.664f)
            lineToRelative(8.03f, -4.207f)
            curveTo(20.582f, 9.485f, 20.79f, 9.5f, 21f, 9.5f)
            curveToRelative(0.344f, 0f, 0.678f, -0.039f, 1f, -0.111f)
            verticalLineToRelative(7.361f)
            curveToRelative(0f, 1.733f, -1.357f, 3.15f, -3.066f, 3.245f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.357f, -3.245f, -3.066f)
            lineTo(2f, 16.75f)
            verticalLineTo(8.608f)
            lineToRelative(9.652f, 5.056f)
            curveToRelative(0.218f, 0.114f, 0.478f, 0.114f, 0.696f, 0f)
            close()
        }
    }.build()
}
