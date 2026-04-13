package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.People20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.People20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 10f)
            curveTo(8.545f, 10f, 10f, 8.545f, 10f, 6.75f)
            reflectiveCurveTo(8.545f, 3.5f, 6.75f, 3.5f)
            reflectiveCurveTo(3.5f, 4.955f, 3.5f, 6.75f)
            reflectiveCurveTo(4.955f, 10f, 6.75f, 10f)
            close()
            moveToRelative(5.687f, 5.145f)
            curveToRelative(0.53f, 0.217f, 1.204f, 0.355f, 2.062f, 0.355f)
            curveToRelative(4f, 0f, 4f, -3f, 4f, -3f)
            curveToRelative(0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4.628f)
            curveTo(12.764f, 11.476f, 13f, 12.085f, 13f, 12.75f)
            verticalLineToRelative(0.356f)
            lineToRelative(-0.003f, 0.064f)
            curveToRelative(-0.002f, 0.05f, -0.006f, 0.113f, -0.014f, 0.188f)
            curveToRelative(-0.014f, 0.149f, -0.042f, 0.347f, -0.096f, 0.578f)
            curveToRelative(-0.077f, 0.338f, -0.213f, 0.762f, -0.45f, 1.209f)
            close()
            moveTo(17f, 7.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(12f, 8.88f, 12f, 7.5f)
            reflectiveCurveTo(13.12f, 5f, 14.5f, 5f)
            reflectiveCurveTo(17f, 6.12f, 17f, 7.5f)
            close()
            moveTo(1.5f, 13f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineTo(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0f, 0f, 4f, -5.25f, 4f)
            reflectiveCurveTo(1.5f, 13f, 1.5f, 13f)
            close()
            moveTo(13f, 13.106f)
            lineToRelative(-0.003f, 0.064f)
            close()
        }
    }.build()
}
