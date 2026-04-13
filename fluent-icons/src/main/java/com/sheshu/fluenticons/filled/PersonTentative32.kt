package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonTentative32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonTentative32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 9f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            close()
            moveTo(4f, 21.5f)
            curveTo(4f, 19.567f, 5.567f, 18f, 7.5f, 18f)
            horizontalLineToRelative(8.876f)
            curveTo(15.2f, 19.52f, 14.5f, 21.429f, 14.5f, 23.5f)
            curveToRelative(0f, 2.534f, 1.047f, 4.823f, 2.732f, 6.459f)
            curveTo(16.827f, 29.986f, 16.415f, 30f, 16f, 30f)
            curveToRelative(-3.198f, 0f, -6.14f, -0.823f, -8.315f, -2.207f)
            curveTo(5.523f, 26.417f, 4f, 24.393f, 4f, 22f)
            verticalLineToRelative(-0.5f)
            close()
            moveToRelative(13.537f, 6.55f)
            curveToRelative(-0.472f, -0.619f, -0.85f, -1.312f, -1.113f, -2.06f)
            lineToRelative(9.567f, -9.566f)
            curveToRelative(0.747f, 0.263f, 1.44f, 0.64f, 2.058f, 1.113f)
            lineTo(17.537f, 28.049f)
            close()
            moveTo(23.5f, 16f)
            horizontalLineToRelative(0.085f)
            lineTo(16f, 23.585f)
            verticalLineTo(23.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            close()
            moveToRelative(-4.549f, 13.463f)
            lineToRelative(10.512f, -10.512f)
            curveToRelative(0.472f, 0.618f, 0.85f, 1.31f, 1.113f, 2.058f)
            lineToRelative(-9.567f, 9.567f)
            curveToRelative(-0.747f, -0.262f, -1.44f, -0.64f, -2.058f, -1.113f)
            close()
            moveTo(23.415f, 31f)
            lineTo(31f, 23.415f)
            verticalLineTo(23.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            horizontalLineToRelative(-0.085f)
            close()
        }
    }.build()
}
