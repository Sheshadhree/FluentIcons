package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpRightDashes16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpRightDashes16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.75f, 2f)
            curveTo(7.336f, 2f, 7f, 2.336f, 7f, 2.75f)
            reflectiveCurveTo(7.336f, 3.5f, 7.75f, 3.5f)
            horizontalLineToRelative(3.69f)
            lineToRelative(-1.22f, 1.22f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.22f, -1.22f)
            verticalLineToRelative(3.69f)
            curveTo(12.5f, 8.664f, 12.836f, 9f, 13.25f, 9f)
            reflectiveCurveTo(14f, 8.664f, 14f, 8.25f)
            verticalLineToRelative(-5.5f)
            curveTo(14f, 2.336f, 13.664f, 2f, 13.25f, 2f)
            horizontalLineToRelative(-5.5f)
            close()
            moveToRelative(1.03f, 6.28f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.5f, -1.5f)
            close()
            moveToRelative(-4f, 4f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.5f, -1.5f)
            close()
        }
    }.build()
}
