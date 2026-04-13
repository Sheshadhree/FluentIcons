package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpRightDashes12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpRightDashes12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 7.25f)
            curveTo(9.5f, 7.664f, 9.836f, 8f, 10.25f, 8f)
            reflectiveCurveTo(11f, 7.664f, 11f, 7.25f)
            verticalLineToRelative(-5.5f)
            curveTo(11f, 1.336f, 10.664f, 1f, 10.25f, 1f)
            horizontalLineToRelative(-5.5f)
            curveTo(4.336f, 1f, 4f, 1.336f, 4f, 1.75f)
            reflectiveCurveTo(4.336f, 2.5f, 4.75f, 2.5f)
            horizontalLineToRelative(3.69f)
            lineTo(6.97f, 3.97f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(9.5f, 3.56f)
            verticalLineToRelative(3.69f)
            close()
            moveTo(6.28f, 6.78f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(3.97f, 6.97f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.25f, -1.25f)
            close()
            moveToRelative(-3f, 3f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(0.97f, 9.97f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.25f, -1.25f)
            close()
        }
    }.build()
}
