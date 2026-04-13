package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonMail32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonMail32",
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
            curveToRelative(2.167f, 1.38f, 5.097f, 2.201f, 8.283f, 2.207f)
            curveToRelative(-0.3f, -0.602f, -0.468f, -1.282f, -0.468f, -2f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -0.718f, 0.168f, -1.398f, 0.468f, -2f)
            horizontalLineTo(5.5f)
            close()
            moveTo(18f, 17f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(0.198f)
            lineToRelative(8f, 4.444f)
            lineToRelative(8f, -4.444f)
            verticalLineTo(20f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(18f)
            close()
            moveToRelative(13f, 4.913f)
            lineToRelative(-7.636f, 4.243f)
            curveToRelative(-0.226f, 0.126f, -0.502f, 0.126f, -0.728f, 0f)
            lineTo(15f, 21.914f)
            verticalLineTo(28f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(10f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-6.087f)
            close()
        }
    }.build()
}
