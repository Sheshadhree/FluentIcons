package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Important32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Important32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            curveToRelative(0f, 3.523f, -1.986f, 8.536f, -3.16f, 11.19f)
            curveTo(18.346f, 20.31f, 17.227f, 21f, 16f, 21f)
            curveToRelative(-1.226f, 0f, -2.345f, -0.69f, -2.84f, -1.81f)
            curveTo(11.985f, 16.535f, 10f, 11.522f, 10f, 8f)
            close()
            moveToRelative(6f, 22f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(17.933f, 23f, 16f, 23f)
            reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
            reflectiveCurveTo(14.067f, 30f, 16f, 30f)
            close()
        }
    }.build()
}
