package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonSquare32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonSquare32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.5f)
            verticalLineToRelative(17f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineToRelative(17f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-17f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            close()
            moveToRelative(20f, 10.929f)
            curveToRelative(0f, 3.642f, -3.134f, 6.071f, -7f, 6.071f)
            reflectiveCurveToRelative(-7f, -2.429f, -7f, -6.071f)
            curveTo(9f, 17.087f, 10.087f, 16f, 11.429f, 16f)
            horizontalLineToRelative(9.142f)
            curveTo(21.913f, 16f, 23f, 17.087f, 23f, 18.429f)
            close()
            moveToRelative(-3.25f, -7.679f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            curveTo(12.25f, 8.679f, 13.929f, 7f, 16f, 7f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            close()
        }
    }.build()
}
