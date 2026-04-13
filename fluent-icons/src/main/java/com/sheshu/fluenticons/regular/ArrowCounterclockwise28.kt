package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCounterclockwise28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCounterclockwise28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.5f, 14f)
            curveToRelative(0f, -5.247f, -4.253f, -9.5f, -9.5f, -9.5f)
            curveToRelative(-2.732f, 0f, -5.194f, 1.152f, -6.928f, 3f)
            horizontalLineTo(9.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(10.164f, 9f, 9.75f, 9f)
            horizontalLineToRelative(-4f)
            curveTo(5.336f, 9f, 5f, 8.664f, 5f, 8.25f)
            verticalLineToRelative(-4f)
            curveTo(5f, 3.836f, 5.336f, 3.5f, 5.75f, 3.5f)
            reflectiveCurveTo(6.5f, 3.836f, 6.5f, 4.25f)
            verticalLineToRelative(1.703f)
            curveTo(8.464f, 4.122f, 11.101f, 3f, 14f, 3f)
            curveToRelative(6.075f, 0f, 11f, 4.925f, 11f, 11f)
            reflectiveCurveToRelative(-4.925f, 11f, -11f, 11f)
            reflectiveCurveTo(3f, 20.075f, 3f, 14f)
            curveToRelative(0f, -0.453f, 0.027f, -0.9f, 0.08f, -1.34f)
            curveToRelative(0.05f, -0.411f, 0.425f, -0.704f, 0.836f, -0.654f)
            curveToRelative(0.411f, 0.05f, 0.704f, 0.424f, 0.654f, 0.835f)
            curveTo(4.524f, 13.22f, 4.5f, 13.607f, 4.5f, 14f)
            curveToRelative(0f, 5.247f, 4.253f, 9.5f, 9.5f, 9.5f)
            reflectiveCurveToRelative(9.5f, -4.253f, 9.5f, -9.5f)
            close()
        }
    }.build()
}
