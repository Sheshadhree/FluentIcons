package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlertBadge24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlertBadge24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 9f)
            curveToRelative(0.338f, 0f, 0.664f, -0.048f, 0.973f, -0.137f)
            curveToRelative(0.018f, 0.211f, 0.027f, 0.425f, 0.027f, 0.64f)
            verticalLineToRelative(4f)
            lineToRelative(1.418f, 3.16f)
            curveToRelative(0.055f, 0.122f, 0.084f, 0.254f, 0.084f, 0.389f)
            curveToRelative(0f, 0.524f, -0.426f, 0.95f, -0.95f, 0.95f)
            horizontalLineToRelative(-16.1f)
            curveToRelative(-0.134f, 0f, -0.266f, -0.029f, -0.388f, -0.083f)
            curveToRelative(-0.479f, -0.215f, -0.693f, -0.777f, -0.479f, -1.256f)
            lineToRelative(1.415f, -3.16f)
            verticalLineTo(9.49f)
            lineToRelative(0.005f, -0.25f)
            curveTo(4.644f, 5.211f, 7.955f, 2.004f, 12f, 2.004f)
            curveToRelative(1.443f, 0f, 2.791f, 0.408f, 3.935f, 1.114f)
            curveTo(15.355f, 3.743f, 15f, 4.58f, 15f, 5.5f)
            curveTo(15f, 7.433f, 16.567f, 9f, 18.5f, 9f)
            close()
            moveToRelative(-3.542f, 10.003f)
            curveToRelative(-0.238f, 1.418f, -1.472f, 2.498f, -2.958f, 2.498f)
            curveToRelative(-1.486f, 0f, -2.72f, -1.08f, -2.958f, -2.498f)
            horizontalLineToRelative(5.916f)
            close()
            moveTo(18.5f, 8f)
            curveTo(19.88f, 8f, 21f, 6.88f, 21f, 5.5f)
            reflectiveCurveTo(19.88f, 3f, 18.5f, 3f)
            reflectiveCurveTo(16f, 4.12f, 16f, 5.5f)
            reflectiveCurveTo(17.12f, 8f, 18.5f, 8f)
            close()
        }
    }.build()
}
