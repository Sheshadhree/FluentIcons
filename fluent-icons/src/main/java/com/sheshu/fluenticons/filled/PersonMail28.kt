package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonMail28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonMail28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.17f, 26f)
            curveTo(13.06f, 25.686f, 13f, 25.35f, 13f, 25f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.768f, 0.289f, -1.47f, 0.764f, -2f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(0.715f)
            curveTo(3f, 23.433f, 7.21f, 26f, 13f, 26f)
            horizontalLineToRelative(0.17f)
            close()
            moveTo(19f, 8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveTo(7f, 4.686f, 7f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            close()
            moveToRelative(-2.5f, 8f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(0.191f)
            lineToRelative(6.5f, 3.25f)
            lineToRelative(6.5f, -3.25f)
            verticalLineTo(18.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-8f)
            close()
            moveTo(27f, 19.809f)
            lineToRelative(-6.276f, 3.138f)
            curveToRelative(-0.141f, 0.07f, -0.307f, 0.07f, -0.448f, 0f)
            lineTo(14f, 19.81f)
            verticalLineToRelative(4.69f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(8f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4.691f)
            close()
        }
    }.build()
}
