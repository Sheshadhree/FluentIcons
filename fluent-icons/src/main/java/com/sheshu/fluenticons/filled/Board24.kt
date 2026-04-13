package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Board24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Board24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.499f, 9.5f)
            lineTo(11.5f, 21f)
            horizontalLineTo(6.25f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.356f, -3.245f, -3.065f)
            lineTo(3f, 17.752f)
            verticalLineTo(9.499f)
            horizontalLineToRelative(8.499f)
            close()
            moveToRelative(1.5f, 5.999f)
            horizontalLineTo(21.5f)
            verticalLineToRelative(2.253f)
            curveToRelative(0f, 1.795f, -1.454f, 3.25f, -3.25f, 3.25f)
            lineTo(13f, 21f)
            lineToRelative(-0.001f, -5.502f)
            close()
            moveToRelative(5.252f, -13.001f)
            curveToRelative(1.733f, 0f, 3.15f, 1.356f, 3.245f, 3.066f)
            lineToRelative(0.005f, 0.184f)
            lineToRelative(-0.001f, 8.251f)
            horizontalLineToRelative(-8.501f)
            lineTo(13f, 2.498f)
            horizontalLineToRelative(5.251f)
            close()
            moveToRelative(-6.751f, 0f)
            lineToRelative(-0.001f, 5.501f)
            horizontalLineTo(3f)
            verticalLineTo(5.748f)
            curveToRelative(0f, -1.795f, 1.456f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(5.25f)
            close()
        }
    }.build()
}
