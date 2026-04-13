package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LeafOne16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LeafOne16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 13.022f)
            verticalLineTo(14.5f)
            curveTo(7.5f, 14.776f, 7.724f, 15f, 8f, 15f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-1.478f)
            curveToRelative(1.079f, -0.11f, 2.128f, -0.579f, 2.955f, -1.406f)
            curveToRelative(1.976f, -1.976f, 1.895f, -5.206f, -0.18f, -7.08f)
            lineToRelative(-2.437f, -2.2f)
            curveToRelative(-0.476f, -0.43f, -1.2f, -0.43f, -1.676f, 0f)
            lineToRelative(-2.437f, 2.2f)
            curveTo(2.65f, 6.41f, 2.568f, 9.64f, 4.545f, 11.616f)
            curveToRelative(0.827f, 0.827f, 1.876f, 1.296f, 2.955f, 1.406f)
            close()
            moveToRelative(3.104f, -7.744f)
            curveToRelative(1.65f, 1.49f, 1.716f, 4.059f, 0.144f, 5.631f)
            curveToRelative(-0.632f, 0.631f, -1.426f, 1f, -2.248f, 1.106f)
            verticalLineTo(7.501f)
            curveTo(8.5f, 7.225f, 8.276f, 7f, 8f, 7f)
            reflectiveCurveTo(7.5f, 7.225f, 7.5f, 7.5f)
            verticalLineToRelative(4.514f)
            curveTo(6.678f, 11.91f, 5.884f, 11.54f, 5.252f, 10.91f)
            curveTo(3.68f, 9.337f, 3.745f, 6.77f, 5.395f, 5.28f)
            lineToRelative(2.437f, -2.202f)
            curveToRelative(0.095f, -0.086f, 0.24f, -0.086f, 0.336f, 0f)
            lineToRelative(2.437f, 2.201f)
            close()
        }
    }.build()
}
