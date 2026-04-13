package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Open16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Open16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 3.5f)
            curveTo(4.06f, 3.5f, 3.5f, 4.06f, 3.5f, 4.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-1.5f)
            curveTo(12.5f, 9.336f, 12.836f, 9f, 13.25f, 9f)
            reflectiveCurveTo(14f, 9.336f, 14f, 9.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(3.231f, 14f, 2f, 12.769f, 2f, 11.25f)
            verticalLineToRelative(-6.5f)
            curveTo(2f, 3.231f, 3.231f, 2f, 4.75f, 2f)
            horizontalLineToRelative(1.5f)
            curveTo(6.664f, 2f, 7f, 2.336f, 7f, 2.75f)
            reflectiveCurveTo(6.664f, 3.5f, 6.25f, 3.5f)
            horizontalLineToRelative(-1.5f)
            close()
            moveTo(8f, 2.75f)
            curveTo(8f, 2.336f, 8.335f, 2f, 8.75f, 2f)
            horizontalLineToRelative(4.5f)
            curveTo(13.664f, 2f, 14f, 2.336f, 14f, 2.75f)
            verticalLineToRelative(4.5f)
            curveTo(14f, 7.664f, 13.664f, 8f, 13.25f, 8f)
            curveToRelative(-0.415f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(4.56f)
            lineTo(9.28f, 7.78f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.294f, -0.292f, -0.294f, -0.767f, 0f, -1.06f)
            lineToRelative(3.22f, -3.22f)
            horizontalLineTo(8.75f)
            curveTo(8.335f, 3.5f, 8f, 3.164f, 8f, 2.75f)
            close()
        }
    }.build()
}
