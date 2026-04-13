package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonCircle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonCircle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2f)
            curveTo(8.268f, 2f, 2f, 8.268f, 2f, 16f)
            reflectiveCurveToRelative(6.268f, 14f, 14f, 14f)
            reflectiveCurveToRelative(14f, -6.268f, 14f, -14f)
            reflectiveCurveTo(23.732f, 2f, 16f, 2f)
            close()
            moveToRelative(0f, 22.5f)
            curveToRelative(-3.866f, 0f, -7f, -2.429f, -7f, -6.071f)
            curveTo(9f, 17.087f, 10.087f, 16f, 11.429f, 16f)
            horizontalLineToRelative(9.142f)
            curveTo(21.913f, 16f, 23f, 17.087f, 23f, 18.429f)
            curveToRelative(0f, 3.642f, -3.134f, 6.071f, -7f, 6.071f)
            close()
            moveToRelative(0f, -10f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            curveTo(12.25f, 8.679f, 13.929f, 7f, 16f, 7f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            close()
        }
    }.build()
}
