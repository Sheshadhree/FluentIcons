package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Wallet48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wallet48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 10f)
            verticalLineToRelative(25.75f)
            curveTo(6f, 39.202f, 8.798f, 42f, 12.25f, 42f)
            horizontalLineToRelative(24.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineToRelative(-17.5f)
            curveToRelative(0f, -3.024f, -2.147f, -5.546f, -5f, -6.125f)
            verticalLineTo(10.25f)
            curveTo(38f, 7.903f, 36.097f, 6f, 33.75f, 6f)
            horizontalLineToRelative(-23.5f)
            curveToRelative(-2.263f, 0f, -4.113f, 1.77f, -4.243f, 4f)
            horizontalLineTo(6f)
            close()
            moveToRelative(29.5f, 0.25f)
            verticalLineTo(12f)
            horizontalLineTo(10.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            reflectiveCurveTo(9.284f, 8.5f, 10.25f, 8.5f)
            horizontalLineToRelative(23.5f)
            curveToRelative(0.967f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            close()
            moveTo(32.25f, 26f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveTo(31.56f, 26f, 32.25f, 26f)
            close()
        }
    }.build()
}
