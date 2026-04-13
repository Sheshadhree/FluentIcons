package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonProhibited32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonProhibited32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 16f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(-8.5f, 2f)
            curveTo(3.567f, 18f, 2f, 19.567f, 2f, 21.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, 1.523f, 4.417f, 3.685f, 5.793f)
            curveTo(7.859f, 29.177f, 10.802f, 30f, 14f, 30f)
            curveToRelative(1.047f, 0f, 2.067f, -0.088f, 3.04f, -0.255f)
            curveTo(15.177f, 28.095f, 14f, 25.685f, 14f, 23f)
            curveToRelative(0f, -1.85f, 0.558f, -3.57f, 1.516f, -5f)
            horizontalLineTo(5.5f)
            close()
            moveTo(23f, 30.5f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveToRelative(0f, -4.142f, -3.358f, -7.5f, -7.5f, -7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            close()
            moveToRelative(0f, -2f)
            curveToRelative(-1.157f, 0f, -2.232f, -0.358f, -3.117f, -0.968f)
            lineToRelative(7.649f, -7.65f)
            curveToRelative(0.61f, 0.886f, 0.968f, 1.96f, 0.968f, 3.118f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            close()
            moveToRelative(3.118f, -10.032f)
            lineToRelative(-7.65f, 7.65f)
            curveTo(17.858f, 25.232f, 17.5f, 24.158f, 17.5f, 23f)
            curveToRelative(0f, -3.038f, 2.462f, -5.5f, 5.5f, -5.5f)
            curveToRelative(1.157f, 0f, 2.232f, 0.358f, 3.118f, 0.968f)
            close()
        }
    }.build()
}
