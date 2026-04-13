package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonCircle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonCircle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 4f)
            curveTo(9.373f, 4f, 4f, 9.373f, 4f, 16f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(22.627f, 4f, 16f, 4f)
            close()
            moveTo(2f, 16f)
            curveTo(2f, 8.268f, 8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            reflectiveCurveTo(2f, 23.732f, 2f, 16f)
            close()
            moveToRelative(14f, 8.5f)
            curveToRelative(3.866f, 0f, 7f, -2.429f, 7f, -6.071f)
            curveTo(23f, 17.087f, 21.913f, 16f, 20.571f, 16f)
            horizontalLineTo(11.43f)
            curveTo(10.087f, 16f, 9f, 17.087f, 9f, 18.429f)
            curveToRelative(0f, 3.642f, 3.134f, 6.071f, 7f, 6.071f)
            close()
            moveToRelative(0f, -10f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            curveTo(19.75f, 8.679f, 18.071f, 7f, 16f, 7f)
            curveToRelative(-2.071f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            close()
        }
    }.build()
}
