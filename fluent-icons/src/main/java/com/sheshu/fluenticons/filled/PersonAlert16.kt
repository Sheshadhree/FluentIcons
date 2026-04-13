package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonAlert16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonAlert16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.533f, 12.356f)
            curveToRelative(-0.507f, 0.43f, -0.628f, 1.05f, -0.465f, 1.581f)
            curveTo(3.495f, 13.581f, 2f, 11.767f, 2f, 10f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(4.534f)
            curveTo(7.694f, 8.588f, 7.5f, 9.271f, 7.5f, 10f)
            verticalLineToRelative(1.537f)
            lineToRelative(-0.966f, 0.819f)
            close()
            moveTo(7f, 1.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(8.519f, 7f, 7f, 7f)
            reflectiveCurveTo(4.25f, 5.769f, 4.25f, 4.25f)
            reflectiveCurveTo(5.481f, 1.5f, 7f, 1.5f)
            close()
            moveTo(8.5f, 10f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            curveToRelative(1.656f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(2f)
            lineToRelative(1.32f, 1.119f)
            curveToRelative(0.355f, 0.3f, 0.142f, 0.881f, -0.324f, 0.881f)
            horizontalLineTo(7.503f)
            curveToRelative(-0.466f, 0f, -0.678f, -0.58f, -0.324f, -0.881f)
            lineTo(8.5f, 12f)
            verticalLineToRelative(-2f)
            close()
            moveToRelative(3f, 6f)
            curveToRelative(-0.653f, 0f, -1.21f, -0.418f, -1.415f, -1f)
            horizontalLineToRelative(2.829f)
            curveToRelative(-0.206f, 0.582f, -0.761f, 1f, -1.415f, 1f)
            close()
        }
    }.build()
}
