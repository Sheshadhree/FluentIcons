package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarAdd32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarAdd32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 15f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            close()
            moveTo(14.654f, 3.839f)
            curveToRelative(0.549f, -1.119f, 2.144f, -1.119f, 2.693f, 0f)
            lineToRelative(3.2f, 6.521f)
            lineToRelative(7.17f, 1.05f)
            curveToRelative(1.228f, 0.179f, 1.719f, 1.685f, 0.833f, 2.554f)
            lineToRelative(-1.064f, 1.044f)
            curveToRelative(-1.428f, -0.952f, -3.142f, -1.508f, -4.987f, -1.508f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            curveToRelative(0f, 1.048f, 0.18f, 2.054f, 0.51f, 2.99f)
            lineToRelative(-4.407f, 2.332f)
            curveToRelative(-1.1f, 0.582f, -2.389f, -0.351f, -2.18f, -1.578f)
            lineToRelative(1.224f, -7.183f)
            lineToRelative(-5.196f, -5.097f)
            curveToRelative(-0.884f, -0.869f, -0.392f, -2.375f, 0.835f, -2.555f)
            lineToRelative(7.17f, -1.049f)
            lineToRelative(3.199f, -6.521f)
            close()
            moveToRelative(8.096f, 13.16f)
            curveTo(22.336f, 17f, 22f, 17.337f, 22f, 17.75f)
            verticalLineToRelative(3.75f)
            horizontalLineToRelative(-3.75f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.337f, -0.75f, 0.75f)
            curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineTo(22f)
            verticalLineToRelative(3.75f)
            curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.335f, 0.75f, -0.75f)
            verticalLineTo(23f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.335f, 0.75f, -0.75f)
            curveToRelative(0f, -0.413f, -0.336f, -0.749f, -0.75f, -0.75f)
            horizontalLineTo(23.5f)
            verticalLineToRelative(-3.75f)
            curveToRelative(0f, -0.413f, -0.336f, -0.749f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
