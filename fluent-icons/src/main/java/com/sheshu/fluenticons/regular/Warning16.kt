package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Warning16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Warning16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 10.25f)
            curveTo(8.75f, 10.664f, 8.414f, 11f, 8f, 11f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            curveTo(7.25f, 9.835f, 7.586f, 9.5f, 8f, 9.5f)
            reflectiveCurveToRelative(0.75f, 0.335f, 0.75f, 0.75f)
            close()
            moveTo(7.5f, 8f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(8.5f, 8.276f, 8.5f, 8f)
            verticalLineTo(5.5f)
            curveTo(8.5f, 5.224f, 8.276f, 5f, 8f, 5f)
            reflectiveCurveTo(7.5f, 5.224f, 7.5f, 5.5f)
            verticalLineTo(8f)
            close()
            moveTo(6.909f, 2.637f)
            curveToRelative(0.477f, -0.853f, 1.705f, -0.853f, 2.182f, 0f)
            lineToRelative(4.75f, 8.502f)
            curveToRelative(0.466f, 0.833f, -0.136f, 1.86f, -1.09f, 1.86f)
            horizontalLineTo(3.246f)
            curveToRelative(-0.955f, 0f, -1.557f, -1.027f, -1.091f, -1.86f)
            lineToRelative(4.753f, -8.502f)
            close()
            moveToRelative(1.309f, 0.488f)
            curveToRelative(-0.095f, -0.17f, -0.341f, -0.17f, -0.437f, 0f)
            lineTo(3.03f, 11.627f)
            curveToRelative(-0.093f, 0.166f, 0.027f, 0.372f, 0.218f, 0.372f)
            horizontalLineToRelative(9.503f)
            curveToRelative(0.191f, 0f, 0.312f, -0.206f, 0.218f, -0.372f)
            lineToRelative(-4.75f, -8.502f)
            close()
        }
    }.build()
}
