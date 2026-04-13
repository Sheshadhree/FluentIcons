package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneScreenTime24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneScreenTime24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 12f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveTo(20.538f, 23f, 17.5f, 23f)
            reflectiveCurveTo(12f, 20.538f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            close()
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineToRelative(6.924f)
            curveToRelative(-2.867f, 0.677f, -5f, 3.252f, -5f, 6.326f)
            curveToRelative(0f, 0.168f, 0.006f, 0.335f, 0.019f, 0.5f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 18f, 8f, 18.336f, 8f, 18.75f)
            curveToRelative(0f, 0.38f, 0.282f, 0.694f, 0.648f, 0.743f)
            lineTo(8.75f, 19.5f)
            horizontalLineToRelative(2.5f)
            lineToRelative(0.062f, -0.003f)
            curveToRelative(0.306f, 0.948f, 0.824f, 1.802f, 1.498f, 2.504f)
            lineTo(6.25f, 22f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineToRelative(7.5f)
            close()
            moveToRelative(2.75f, 12f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3.002f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(17f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
