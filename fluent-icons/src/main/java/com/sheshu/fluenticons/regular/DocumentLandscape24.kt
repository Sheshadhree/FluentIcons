package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentLandscape24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentLandscape24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5.5f)
            curveTo(3.725f, 5.5f, 3.5f, 5.724f, 3.5f, 6f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.276f, 0.225f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(16f)
            curveToRelative(0.275f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-6f)
            horizontalLineTo(16f)
            curveToRelative(-1.104f, 0f, -2f, -0.896f, -2f, -2f)
            verticalLineTo(5.5f)
            horizontalLineTo(4f)
            close()
            moveToRelative(15.379f, 5f)
            lineTo(15.5f, 6.622f)
            verticalLineTo(10f)
            curveToRelative(0f, 0.276f, 0.225f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3.379f)
            close()
            moveToRelative(-3.793f, -5.914f)
            lineToRelative(5.828f, 5.829f)
            curveToRelative(0.026f, 0.026f, 0.046f, 0.058f, 0.07f, 0.085f)
            curveToRelative(0.064f, 0.071f, 0.127f, 0.141f, 0.18f, 0.219f)
            curveToRelative(0.027f, 0.04f, 0.045f, 0.086f, 0.068f, 0.128f)
            curveToRelative(0.04f, 0.071f, 0.084f, 0.141f, 0.116f, 0.216f)
            curveToRelative(0.082f, 0.197f, 0.123f, 0.409f, 0.138f, 0.624f)
            curveTo(21.989f, 11.734f, 22f, 11.78f, 22f, 11.828f)
            verticalLineTo(18f)
            curveToRelative(0f, 1.104f, -0.896f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.104f, 0f, -2f, -0.896f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.104f, 0.896f, -2f, 2f, -2f)
            horizontalLineToRelative(10.172f)
            curveToRelative(0.53f, 0f, 1.039f, 0.211f, 1.414f, 0.586f)
            close()
        }
    }.build()
}
