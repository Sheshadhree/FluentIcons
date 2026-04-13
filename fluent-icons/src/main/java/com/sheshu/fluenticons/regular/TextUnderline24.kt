package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextUnderline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextUnderline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 19f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(17.25f, 20.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 20.5f, 6f, 20.164f, 6f, 19.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(6.75f, 19f)
            horizontalLineToRelative(10.5f)
            horizontalLineToRelative(-10.5f)
            close()
            moveToRelative(10.5f, -15f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(18f, 4.75f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 4.394f, -2.063f, 6.75f, -6.003f, 6.75f)
            curveToRelative(-3.855f, 0f, -5.91f, -2.255f, -5.994f, -6.466f)
            lineTo(6f, 10.75f)
            verticalLineToRelative(-6f)
            curveTo(6f, 4.336f, 6.336f, 4f, 6.75f, 4f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(7.5f, 4.75f)
            verticalLineToRelative(6f)
            curveTo(7.497f, 14.358f, 8.934f, 16f, 11.997f, 16f)
            curveToRelative(2.985f, 0f, 4.428f, -1.56f, 4.5f, -4.976f)
            lineTo(16.5f, 10.75f)
            verticalLineToRelative(-6f)
            curveTo(16.5f, 4.336f, 16.836f, 4f, 17.25f, 4f)
            close()
        }
    }.build()
}
