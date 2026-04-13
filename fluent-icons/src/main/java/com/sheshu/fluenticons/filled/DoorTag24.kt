package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DoorTag24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DoorTag24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 6.5f)
            curveToRelative(-0.49f, 0f, -0.924f, 0.232f, -1.201f, 0.601f)
            curveToRelative(-0.747f, 0.994f, -2.157f, 1.194f, -3.15f, 0.447f)
            curveTo(6.655f, 6.803f, 6.455f, 5.393f, 7.2f, 4.399f)
            curveTo(8.292f, 2.946f, 10.036f, 2f, 12f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(8f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-8.5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(12.828f, 6.5f, 12f, 6.5f)
            close()
            moveToRelative(-2.25f, 11f)
            curveTo(9.336f, 17.5f, 9f, 17.836f, 9f, 18.25f)
            reflectiveCurveTo(9.336f, 19f, 9.75f, 19f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-4.5f)
            close()
        }
    }.build()
}
